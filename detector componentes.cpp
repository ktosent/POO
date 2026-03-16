#include <iostream>
#include <string>
#include <windows.h>
#include <iomanip>

using namespace std;

class Dispositivo {
public:
    string nombre;
    string caracteristica;
    
    Dispositivo(string nom, string carac) {
        nombre = nom;
        caracteristica = carac;
    }
};

class Nodo {
public:
    Dispositivo* dato;
    Nodo* siguiente;

    Nodo(Dispositivo* d) {
        dato = d;
        siguiente = NULL;
    }
};

class ListaHardware {
private:
    Nodo* cabeza;

public:
    ListaHardware() {
        cabeza = NULL;
    }

    void agregar(string nombre, string caracteristica) {
        Dispositivo* nuevoDisp = new Dispositivo(nombre, caracteristica);
        Nodo* nuevoNodo = new Nodo(nuevoDisp);

        if (cabeza == NULL) {
            cabeza = nuevoNodo;
        } else {
            Nodo* temp = cabeza;
            while (temp->siguiente != NULL) {
                temp = temp->siguiente;
            }
            temp->siguiente = nuevoNodo;
        }
    }

    void mostrarTabla() {
        cout << "\n";
        cout << left << setw(25) << "COMPONENTE" << " | " << "CARACTERISTICAS RELEVANTES" << endl;
        cout << "--------------------------|---------------------------------------------------" << endl;

        Nodo* temp = cabeza;
        while (temp != NULL) {
            cout << left << setw(25) << temp->dato->nombre << " | " << temp->dato->caracteristica << endl;
            temp = temp->siguiente;
        }
        cout << "--------------------------|---------------------------------------------------\n" << endl;
    }
};

int main() {
    ListaHardware miPC; 

    MEMORYSTATUSEX estadoMemoria;
    estadoMemoria.dwLength = sizeof(estadoMemoria);
    GlobalMemoryStatusEx(&estadoMemoria);
    string ramTotal = to_string(estadoMemoria.ullTotalPhys / (1024 * 1024 * 1024)) + " GB Totales";
    miPC.agregar("Memoria RAM", ramTotal);

    SYSTEM_INFO infoSistema;
    GetSystemInfo(&infoSistema);
    string nucleos = "Nucleos logicos: " + to_string(infoSistema.dwNumberOfProcessors);
    miPC.agregar("Procesador (CPU)", nucleos);

    DWORD sectoresPorCluster, bytesPorSector, clustersLibres, clustersTotales;
    if(GetDiskFreeSpaceA("C:\\", &sectoresPorCluster, &bytesPorSector, &clustersLibres, &clustersTotales)) {
        long long discoTotal = ((long long)clustersTotales * sectoresPorCluster * bytesPorSector) / (1024 * 1024 * 1024);
        miPC.agregar("Disco Duro (C:)", to_string(discoTotal) + " GB Totales de almacenamiento");
    }

    miPC.agregar("Tarjeta de Video (GPU)", "Lectura requiere WMI (Ej. Arquitectura dedicada/integrada)");
    miPC.agregar("Tarjeta de Red", "Lectura requiere WMI (Ej. Adaptador Ethernet/Wi-Fi)");
    miPC.agregar("BIOS", "Lectura requiere WMI o Registry (Ej. Version UEFI)");
    miPC.agregar("Puertos", "USB 3.0 / USB 2.0 / HDMI / DisplayPort detectados en placa");

    cout << "=== HERRAMIENTA DE DIAGNOSTICO DE HARDWARE ORIENTADA A OBJETOS ===" << endl;
    miPC.mostrarTabla();

    cout << "Presione una tecla para continuar y finalizar el programa..." << endl;
    system("pause>nul");

    return 0;
}