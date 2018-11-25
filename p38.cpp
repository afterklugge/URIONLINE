#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

// bool cmpStrByLen(const string& s1, const string& s2)
// {
    // return s1.size() < s2.size();
// }

void center(vector<string>& text)
{
    //auto p = max_element(text.begin(), text.end(), cmpStrByLen);

    auto p = max_element(text.begin(), text.end(),
                         [](const string& s1, const string& s2)
                         {return s1.size() < s2.size();});
                         
    int maxLen = (*p).size();
    
    for (auto& s: text)
    {
        int w = (maxLen - s.size());
        s = string(w / 2, '.') + s + string(w / 2 + w % 2, '.');
    }
}

int main()
{
    
    vector<string> t = { 
        "xxxx",
        "AxxxxxxxxxxxxxxxxxxxA",
        "xxxxxxxxxxxxxx",
        "xxxxxxxxxxx"
    };
    
    center(t);
    
    for (const auto& s: t)
    {
        cout << s << endl;
    }
    
    return 0;
}