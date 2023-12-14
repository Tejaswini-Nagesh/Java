/*const fruits=["apple","banana","cherry"];
for(const fruit of fruits){
    console.log(fruit+"1");
}
*/
/*const sentence="Hello world";
    const newReverse=sentence.split('').reverse().join('');

console.log(newReverse);
let sum=0
const arrays=[1,2,3,4];
for(arr of arrays ){

     sum=sum+arr;
}
console.log(sum);
//for in
const person={
    name:"Alice",
    age:"30",
    city:"New york"
};
for(const key in person){
    console.log(key+"" +person);
}*/
//
/*const colors = ["red", "green", "blue"];

for (const index in colors) {
  console.log(colors[index]);
}
*/
//================================================
//find maximum no. in array
let arr=[2,4,6,8];
function findMax(arr){
    return Math.max(...arr);
}
console.log(findMax(arr));
//remove duplicates
let arr2=[3,3,2,2,1,4];
let newarr2=[new Set(arr2)];
console.log(newarr2);
//sum of elements
let arr3=[2,2,2];
function findSum(arr3) {
    return arr3.reduce((acc, num) => acc + num, 0);
}
console.log(findSum(arr3));
