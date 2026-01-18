#include <iostream>
#include <cmath>
#include <algorithm> // Dung cho ham sort
#include <vector>
using namespace std;

const int MAX = 100; // Dinh nghia kich thuoc toi da cho mang tinh

// Ham kiem tra so chinh phuong
bool laSoChinhPhuong(int n) {
    if (n < 0) return false;
    int k = sqrt(n);
    return (k * k == n);
}

// 1. Nhap ma tran vuong
void nhapMaTran(int a[MAX][MAX], int &n) {
    cout << "Nhap cap cua ma tran (n): "; cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << "a[" << i << "][" << j << "] = ";
            cin >> a[i][j];
        }
    }
}

// 2. In ma tran
void xuatMaTran(int a[MAX][MAX], int n) {
    cout << "\n--- MA TRAN ---" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << a[i][j] << "\t";
        }
        cout << endl;
    }
}

// 3. Tong cac phan tu
long long tinhTong(int a[MAX][MAX], int n) {
    long long tong = 0;
    for (int i = 0; i < n; i++) 
        for (int j = 0; j < n; j++) 
            tong += a[i][j];
    return tong;
}

// 4. Tim phan tu lon nhat cua hang k
void maxHangK(int a[MAX][MAX], int n) {
    int k;
    cout << "\nNhap hang k can tim max (0 den " << n-1 << "): "; cin >> k;
    if (k >= 0 && k < n) {
        int maxVal = a[k][0];
        for (int j = 1; j < n; j++) {
            if (a[k][j] > maxVal) maxVal = a[k][j];
        }
        cout << "Max hang " << k << " la: " << maxVal << endl;
    } else cout << "Hang k khong hop le!" << endl;
}

// 5. Dem so am cot k
void demAmCotK(int a[MAX][MAX], int n) {
    int k, dem = 0;
    cout << "Nhap cot k can dem so am: "; cin >> k;
    if (k >= 0 && k < n) {
        for (int i = 0; i < n; i++) {
            if (a[i][k] < 0) dem++;
        }
        cout << "So luong so am o cot " << k << " la: " << dem << endl;
    }
}

// 6. So chinh phuong tren duong cheo chinh
void scpCheoChinh(int a[MAX][MAX], int n) {
    cout << "So chinh phuong tren duong cheo chinh: ";
    for (int i = 0; i < n; i++) {
        if (laSoChinhPhuong(a[i][i])) {
            cout << a[i][i] << " ";
        }
    }
    cout << endl;
}

// 7. TBC so la uoc cua 150 tren duong cheo phu
void tbcCheoPhu(int a[MAX][MAX], int n) {
    int tong = 0, dem = 0;
    // Duong cheo phu: a[i][n-1-i]
    for (int i = 0; i < n; i++) {
        int x = a[i][n - 1 - i];
        if (x != 0 && 150 % x == 0) { // x phai khac 0 de chia het
            tong += x;
            dem++;
        }
    }
    if (dem > 0) cout << "TBC cac uoc cua 150 tren cheo phu: " << (float)tong/dem << endl;
    else cout << "Khong co so nao thoa man tren cheo phu." << endl;
}

// 8. Sap xep cac hang giam dan
// Su dung ham sort cua thu vien algorithm
// Ham sort mac dinh tang dan, dung greater<int>() de giam dan
void sapXepHang(int a[MAX][MAX], int n) {
    for (int i = 0; i < n; i++) {
        sort(a[i], a[i] + n, greater<int>());
    }
    cout << "\nDa sap xep cac hang giam dan.";
    xuatMaTran(a, n);
}

int main() {
    int a[MAX][MAX], n;
    nhapMaTran(a, n);
    xuatMaTran(a, n);
    
    cout << "Tong ma tran: " << tinhTong(a, n) << endl;
    
    maxHangK(a, n);
    demAmCotK(a, n);
    scpCheoChinh(a, n);
    tbcCheoPhu(a, n);
    sapXepHang(a, n);
    
    return 0;
}
