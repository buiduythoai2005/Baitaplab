#include <iostream>
#include <cmath>
using namespace std;

// Hàm tính giai thừa cho bài 5, 6
long long giaiThua(int n) {
    long long gt = 1;
    for (int i = 1; i <= n; i++) gt *= i;
    return gt;
}

// 1. S = 1 + 1/2 + ... + 1/n
double bai1_1(int n) {
    double s = 0;
    for (int i = 1; i <= n; i++) s += 1.0 / i;
    return s;
}

// 2. S = 1/2 + 1/4 + ... + 1/2n
double bai1_2(int n) {
    double s = 0;
    for (int i = 1; i <= n; i++) s += 1.0 / (2 * i);
    return s;
}

// 3a. S = 1 + 3 + 6 + 9 + ... + 3n 
long long bai1_3a(int n) {
    long long s = 1; 
    for (int i = 1; i <= n; i++) s += 3 * i;
    return s;
}

// 3b. S = 1 + 3 + 5 + ... + (2n+1)
long long bai1_3b(int n) {
    long long s = 0;
    for (int i = 0; i <= n; i++) s += (2 * i + 1);
    return s;
}

// 4. S = 1 + x + x^2 + ... + x^n
double bai1_4(int n, double x) {
    double s = 0;
    for (int i = 0; i <= n; i++) s += pow(x, i);
    return s;
}

// 5. S = 1 - x^2/2! + x^4/4! ...
double bai1_5(int n, double x) {
    double s = 1; // Số hạng đầu tiên là 1 (khi i=0)
    for (int i = 1; i <= n; i++) {
        double term = pow(x, 2 * i) / giaiThua(2 * i);
        if (i % 2 == 1) s -= term; // Lẻ trừ
        else s += term;            // Chẵn cộng
    }
    return s;
}

// 6. S = 1 + x/1! + x^2/2! + ... + x^n/n!
double bai1_6(int n, double x) {
    double s = 1; 
    for (int i = 1; i <= n; i++) {
        s += pow(x, i) / giaiThua(i);
    }
    return s;
}

int main() {
    int n; double x;
    cout << "Nhap n: "; cin >> n;
    cout << "Nhap x (cho bai 4,5,6): "; cin >> x;

    cout << "1. S = " << bai1_1(n) << endl;
    cout << "2. S = " << bai1_2(n) << endl;
    cout << "3a. S = " << bai1_3a(n) << endl;
    cout << "3b. S = " << bai1_3b(n) << endl;
    cout << "4. S = " << bai1_4(n, x) << endl;
    cout << "5. S = " << bai1_5(n, x) << endl;
    cout << "6. S = " << bai1_6(n, x) << endl;
    return 0;
}
