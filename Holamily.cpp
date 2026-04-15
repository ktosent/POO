#include <iostream.h>
void main (void) {
    char nombre [30];
    int edad;
    cout << "Hola! Como te llamas? ";
    cin >> nombre;
    cout << "Cuantos años tienes? ";
    cin >> edad;
    cout << "Hola " << nombre ;
    cout << ", tienes " << edad << " años" << endl;
}