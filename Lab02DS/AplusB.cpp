#include<iostream>
using namespace std;
int main(){
	int y, m;
	cin >> y;
	cin >> m;
	
	int gap = m - y;
	int oldest = m + gap;
	
	cout << oldest << endl;
	
	return 0;
}
