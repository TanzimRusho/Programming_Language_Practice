#include <iostream>
using namespace std;

class Vector {
    int x, y;
public:
    Vector()
    {
        cout << "constructing...1" << endl;    
    }
    
    Vector(int _x, int _y)
    {
        
        cout << "constructing...2" << endl;
        x = _x;
        y = _y;
    }
    
    Vector(int _x)
    {
        cout << "constructing...3" << endl;
        x = _x;
    }

    ~Vector()
    {
        cout << x << " " << y << endl;
        cout << "destructing..." << endl;
    }

    void print()
    {
        cout << x << " " << y << endl;   
    }
    
};

int main()
{
    Vector u(3, 4), v, w(6);
    
    u.print();
    v.print();
    w.print();
    
    return 0;
}
