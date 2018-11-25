#include <iostream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;

// C++11 move semantics
string join(const string& d, const vector<string>& v)
{
    string res;
    
    if (not v.empty())
    {
        res = v.front();
        for (size_t i = 1; i < v.size(); ++i)
        {
            res += d + v[i];
        }
    }
       
    return res;
}

// C++11 move semantics
vector<string> split(const string& s)
{
    vector<string> res;
    
    istringstream sinp(s);
    
    string w;
    while (sinp >> w)
    {
        res.push_back(w);
    }
    
    return res;
}

int main()
{
    vector<string> v1 = {"Hello", "World"};
    vector<string> v2 = {"C++", "is", "a", "very", "flexible", "!!!"};
    vector<string> v3 = {"C++"};
    vector<string> v4;
    
    string s1 = join(".", v1);
    string s2 = join(".", v2);
    string s3 = join(".", v3);
    string s4 = join(".", v4);
    
    cout << s1 << endl
         << s2 << endl
         << s3 << endl
         << s4 << endl;
    
    cout << boolalpha;
    
    cout << (s1 == "Hello.World") << endl
         << (s2 == "C++.is.a.very.flexible.!!!") << endl
         << (s3 == "C++") << endl
         << (s4 == "") << endl;
    
    cout << "----" << endl;
    
    vector<string> v5 = split("  Hello World  ");
    vector<string> v6 = split("Hello C++ World !!!");
    
    vector<string> a5 = {"Hello", "World"};
    vector<string> a6 = {"Hello", "C++", "World", "!!!"};
    
    cout << (v5 == a5) << endl;
    cout << (v6 == a6) << endl;
    
    return 0;
}