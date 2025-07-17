#include<bits/stdc++.h> 
#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp> 
typedef unsigned long long ull;
typedef unsigned int ui;
typedef long double ld;
#define mod 1000000007
#define int long long 
#define MAX LLONG_MAX
#define MIN LLONG_MIN
#define double long double
using namespace std;
using namespace __gnu_pbds;
void __print(int x) {cerr << x;}
void __print(float x) {cerr << x;}
void __print(double x) {cerr << x;}
void __print(char x) {cerr << '\'' << x << '\'';}
void __print(const char *x) {cerr << '\"' << x << '\"';}
void __print(const string &x) {cerr << '\"' << x << '\"';}
void __print(bool x) {cerr << (x ? "true" : "false");}
 
typedef tree<int,null_type,less<int>,rb_tree_tag,tree_order_statistics_node_update>oset;
typedef tree<pair<int,int>,null_type,less<pair<int,int>>,rb_tree_tag,tree_order_statistics_node_update>omultiset; 
template<typename T, typename V>
void __print(const pair<T, V> &x) {cerr << '{'; __print(x.first); cerr << ',';
__print(x.second); cerr << '}';}
template<typename T>
void __print(const T &x) {int f = 0; cerr << '{'; for (auto &i: x) 
cerr << (f++ ? "," : ""), __print(i); cerr << "}";}
void _print() {cerr << "]\n";}
template <typename T, typename... V>
void _print(T t, V... v) {__print(t); if (sizeof...(v)) cerr << ", "; _print(v...);}
#ifndef ONLINE_JUDGE
#define debug(x...) cerr << "[" << #x << "] = ["; _print(x)
#else
#define debug(x...)
#endif


 
void sol(){
    int n,q;
    cin >> n >> q;
    vector<int > arr(n);
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    sort(arr.begin(),arr.end());
    while(q--){
        int x;
        cin >> x;
        int result=upper_bound(arr.begin(),arr.end(),x)-arr.begin();
        cout << result << endl;
    }
}

 
signed  main()
{
    #ifndef ONLINE_JUDGE
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    #endif
    
    ios::sync_with_stdio(false);
    cin.tie(0);
    // int tttt;
    // cin >> tttt;
    // while(tttt--)
        sol();
    return 0;
}
