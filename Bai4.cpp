#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int main() {
    string s;
    cout << "Nhap chuoi: ";
    getline(cin, s); // Nhap chuoi co khoang trang

    int chuCai = 0, chuSo = 0;
    for (char c : s) {
        if (isalpha(c)) chuCai++;
        if (isdigit(c)) chuSo++; 
    }
    cout << "So chu cai: " << chuCai << endl;
    cout << "So chu so: " << chuSo << endl;

    // 3. Chen @ truoc "gmail.com"
    string target = "gmail.com";
    size_t pos = s.find(target);
    if (pos != string::npos) {
        s.insert(pos, "@");
    }
    cout << "Sau khi chen @: " << s << endl;

    // 5. Thay the "gmail.com" bang "ctech.edu.vn"
    // Tim lai vi tri gmail.com (vi da bi dich chuyen boi @)
    pos = s.find(target); 
    if (pos != string::npos) {
        s.replace(pos, target.length(), "ctech.edu.vn");
    }
    cout << "Sau khi thay the: " << s << endl;

    // 10. Doi xung chuoi (Dao nguoc)
    string s_rev = "";
    for (int i = s.length() - 1; i >= 0; i--) {
        s_rev += s[i];
    }
    cout << "Chuoi dao nguoc: " << s_rev << endl;

    return 0;
}
