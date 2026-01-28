#include <iostream>
#include <algorithm>
using namespace std;

//  Nhap mang dong
void nhapMang(int* &a, int &n) {
    cout << "Nhap so phan tu: "; cin >> n;
    a = new int[n]; // Cap phat bo nho dong
    for (int i = 0; i < n; i++) {
        cout << "a[" << i << "] = ";
        cin >> a[i];
    }
}

// Hien thi
void xuatMang(int* a, int n) {
    for (int i = 0; i < n; i++) cout << a[i] << " ";
    cout << endl;
}

//  Tim Min
int timMin(int* a, int n) {
    int minVal = a[0];
    for (int i = 1; i < n; i++) if (a[i] < minVal) minVal = a[i];
    return minVal;
}

// Tinh tong
long long tinhTong(int* a, int n) {
    long long tong = 0;
    for (int i = 0; i < n; i++) tong += a[i];
    return tong;
}

// 5. Xoa phan tu tai vi tri k

void xoaTaiK(int* &a, int &n) {
    int k;
    cout << "Nhap vi tri k can xoa (0 den " << n-1 << "): "; cin >> k;
    if (k < 0 || k >= n) return;

    int* temp = new int[n - 1]; 
    for (int i = 0, j = 0; i < n; i++) {
        if (i == k) continue; 
        temp[j++] = a[i];
    }
    delete[] a; 
    a = temp;   
    n--;        
    cout << "Da xoa phan tu tai " << k << endl;
}

// Them x vao sau vi tri k

void themVaoSauK(int* &a, int &n) {
    int x, k;
    cout << "Nhap gia tri x can them: "; cin >> x;
    cout << "Nhap vi tri k (them sau k): "; cin >> k;
    
    
    
    int* temp = new int[n + 1];
    int j = 0;
    for (int i = 0; i < n; i++) {
        temp[j++] = a[i];
        if (i == k) {
            temp[j++] = x; // Them x ngay sau khi copy phan tu thu k
        }
    }
    
    
    delete[] a;
    a = temp;
    n++;
    cout << "Da them " << x << " vao sau vi tri " << k << endl;
}

// Sap xep giam dan
void sapXepGiam(int* a, int n) {
    // Su dung sort voi con tro: a la bat dau, a + n la ket thuc
    sort(a, a + n, greater<int>()); 
    cout << "Da sap xep giam dan." << endl;
}

//  Xoa cac phan tu co gia tri Lon Nhat
void xoaMax(int* &a, int &n) {
    if (n == 0) return;
    
    // Tim max truoc
    int maxVal = a[0];
    for(int i=1; i<n; i++) if(a[i] > maxVal) maxVal = a[i];

    // Dem so luong phan tu khong phai la max
    int newSize = 0;
    for(int i=0; i<n; i++) if(a[i] != maxVal) newSize++;

    // Tao mang moi
    int* temp = new int[newSize];
    int j = 0;
    for(int i=0; i<n; i++) {
        if(a[i] != maxVal) {
            temp[j++] = a[i];
        }
    }

    delete[] a;
    a = temp;
    n = newSize;
    cout << "Da xoa cac phan tu co gia tri lon nhat (" << maxVal << ")" << endl;
}

int main() {
    int n;
    int* a = NULL; // Khoi tao con tro null

    nhapMang(a, n);
    cout << "Mang ban dau: "; xuatMang(a, n);

    cout << "Min: " << timMin(a, n) << endl;
    cout << "Tong: " << tinhTong(a, n) << endl;

    xoaTaiK(a, n);
    xuatMang(a, n);

    themVaoSauK(a, n);
    xuatMang(a, n);

    sapXepGiam(a, n);
    xuatMang(a, n);

    xoaMax(a, n);
    cout << "Sau khi xoa tat ca so Max: "; 
    xuatMang(a, n);

    // Giai phong bo nho khi ket thuc chuong trinh
    delete[] a; 
    return 0;
}
