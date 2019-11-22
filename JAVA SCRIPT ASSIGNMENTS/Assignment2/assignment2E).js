//Named Functions
console.log('Named functions')
function prime(num){
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    }
}
prime(4);
console.log('----------------------------------------');
//Function Expression
console.log('Function Expression');
var prime = function(num){
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    }
    return num;  
} 
var result = prime(7);
console.log('------------------------------------------');
//Self Invoked Function
console.log('Self Invoked Function');
(function(num)
{
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    }
    return num;     
})(2);
console.log('---------------------------------------------');
//Fat Arrow Function
console.log('Fat Arrow Function');
var prime = (num)=>{
    var count=0;
for(var i = 1;i<=num;i++){
    if(num%i==0){
       count++;
    }
    if(count>2){
        break;
    }
} 
    if(count==2)
    {
        console.log(num,' is a prime number')
    }
    else{
        console.log(num,'is not a prime')
    } 
}
prime(9);