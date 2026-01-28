#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>
using namespace std;

// Kiem tra so chinh phuong (So co can bac 2 la so nguyen)
bool laSoChinhPhuong(int n) {
    if (n < 0) return false;
    int k = sqrt(n);
    return (k * k == n);
}

void nhapMang(vector<int> &a, int n) {
    for (int i = 0; i < n; i++) {
        cout << "a[" << i << "] = ";
        cin >> a[i];
    }
}

void xuatMang(const vector<int> &a) {
    for (int x : a) cout << x << " ";
    cout << endl;
}

// Tong, Dem so am, Trung binh cong so chinh phuong
void xuLyMang(const vector<int> &a) {
    int tong = 0;
    int demAm = 0;
    int tongCP = 0, demCP = 0;
    int _min = a[0], _max = a[0];

    cout << "Cac so chinh phuong: ";
    for (int x : a) {
        tong += x; 
        if (x < 0) demAm++;
        if (laSoChinhPhuong(x)) { 
            cout << x << " ";
            tongCP += x;
            demCP++;
        }
        if (x > _max) _max = x;
        if (x < _min) _min = x;
    }
    cout << endl;

    cout << "Tong mang: " << tong << endl;
    cout << "So luong so am: " << demAm << endl;
    if (demCP > 0)
        cout << "TBC so chinh phuong: " << (double)tongCP / demCP << endl; // [cite: 9]
    else 
        cout << "Khong co so chinh phuong." << endl;

    cout << "Min: " << _min << ", Max: " << _max << endl;

    // In so trong khoang (min, max)
    cout << "Cac so trong khoang (" << _min << ", " << _max << "): ";
    for(int x : a) {
        if(x > _min && x < _max) cout << x << " ";
    }
    cout << endl;
}

int main() {
    int n;
    cout << "Nhap so phan tu: "; cin >> n;
    vector<int> a(n);
    nhapMang(a, n);
    cout << "Mang vua nhap: "; xuatMang(a);
    xuLyMang(a);
    return 0;
}
