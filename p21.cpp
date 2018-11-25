#include <iostream>
#include <cctype>

using namespace std;

int main()
{
    int nLetters = 0;
    int nUpperCase = 0;
    int nLowerCase = 0;
    int nDigits = 0;
    int nSpaces = 0;
    int nControl = 0;
    
    char ch;
    while (cin.get(ch))
    {
        nLetters += isalpha(ch) ? 1: 0;
        nUpperCase += isupper(ch) ? 1: 0;
        nLowerCase += islower(ch) ? 1: 0;
        nDigits += isdigit(ch) ? 1: 0;
        nSpaces += isspace(ch) ? 1: 0;
        nControl += iscntrl(ch) ? 1: 0;
    }
    
    cout << "letters: " << nLetters << endl
         << "uppercase letters: " << nUpperCase << endl
         << "lowercase letters: " << nLowerCase << endl
         << "digits: " << nDigits << endl
         << "whitespaces: " << nSpaces << endl
         << "control symbols: " << nControl << endl;
         
    return 0;
}