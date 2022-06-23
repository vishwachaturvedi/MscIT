#include<iostream>
using namespace std;

int main()
{
int num,rem,strn,arm=0;

cout<<"enter any num ";
cin>>num;

strn=num;
 for(num;num>=1;num++)
 	{
	rem=num%10;
	num=num%10;
	arm=arm+(rem*rem*rem);
	}
if(strn==arm)
	cout<<"the num armstrong number"<<endl;
else
	cout<<"the num is not an armstrong number"<<endl;

return 0;

}