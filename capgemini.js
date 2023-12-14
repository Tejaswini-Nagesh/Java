
/*obj1={
    a:10
};
const obj2=obj1;// both has same memory location
obj2.a=20;
console.log(obj1);
console.log(obj2);
let obj1;
obj1={
    a:10
}
const obj2={...obj1};//copy value only
obj2.a=20;
console.log(obj1);
console.log(obj2);
//==============
function mul(a){
   return function (b){
        return function(c)
        {
            return a*b*c;
        }
    }
}
console.log(mul(2)(3)(4));
//========================================
const mul4 = (a) => {
    return (b) => {
        return (c) => {
            return a * b * c;
        };
    };
};

const result = mul4(2)(3)(4);
console.log(result); // Output: 24 (2 * 3 * 4)
//===============================================
var arr=[1,0,0,1,0,1,1];
var ones=arr.filter(val=>{
    return val==1;
})
console.log(ones.length);
*/
//==========================================================================

//find max
/*const arr=[2,3,4,5];
function findMax(){
    return Math.max(...arr);
}
console.log(findMax(arr));

//palindrome
const str="Teju";
function palindrome(str){
    return str===str.split('').reverse().join('');

}
console.log(palindrome(str));
//Reverse String
const arr3=[6,8,1,3,5];
function filterArray(arr){
    return arr.filter((num)=>num%2==0)
}
console.log(filterArray(arr3));*/
//===
const arr3=[6,8,1,3,5];

function secondLargest(arr3){
    arr3.sort((a,b)=>(b-a));
    return arr3[1];
}
console.log(secondLargest(arr3));
//============================
const secondLarge=(arr)=>{
    first=arr[0];
    second=arr[1];
    for(var i=0;i<arr.length;i++)
    {
        if(first<arr[i]){
            second=first;
            first=arr[i];
        }
        else if(second<arr[i]){
            second=arr[i];
        }
    }
    console.log(second);
}
secondLarge(arr3);
//merge array
const arr4=[2,3,4];
const arr5=[8,6,1,2];
/*const newArray=[...arr4,...arr5];
console.log(...new Set(newArray));
*/
function mergeArray(arr4,arr5){
    const mergeArray=[];
    const maxLenght=Math.max(arr4.length,arr5.length);
    for(let i=0;i<maxLenght;i++){
        if(i<arr4.length){
            mergeArray.push(arr4[i]);
        }
        if(i<arr5.length){
            mergeArray.push(arr5[i]);
        }
    }
    return mergeArray;
}
console.log(mergeArray(arr4,arr5));

//smallest no
function smallestelement(arr){
    let temp;
    for(let i=0;i<arr.length;i++){
        if(arr[i]>arr[i-1]){
             temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
    }
    return temp;
}
console.log(smallestelement(arr4));
