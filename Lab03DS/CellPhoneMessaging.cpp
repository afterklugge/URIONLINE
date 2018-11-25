#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    vector<string> buttons = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    int counter = 0;
    int tempInd = -1;

    while (true) {
        string word; cin >> word;
        if (word == "halt") break;

        tempInd = -1;
        counter = 0; //dada
        for (int ch = 0; ch < word.size(); ++ch) {
            for (int i = 0; i < buttons.size(); ++i) {
                for (int j = 0; j < buttons[i].size(); ++j) {
                    if (word[ch] == buttons[i][j]) {
                        //cout << "LETTER " << word[ch] << endl;
                        counter += j+1;
                        //cout << "TEMP INDEX " << tempInd << " THIS INDEX " << i << endl;
                        if (tempInd == i) {
                            counter += 2;
                        }
                        tempInd = i;
                    }
                }
            }
        }

        cout << counter << endl;
    }


    return 0;
}
