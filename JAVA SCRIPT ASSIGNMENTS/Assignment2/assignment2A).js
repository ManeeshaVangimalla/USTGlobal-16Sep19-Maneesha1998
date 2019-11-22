//Named Function
console.log('Named Functions');
function factorial(num)
{
    var i,fact=1;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    console.log('factorial  is=',fact);
}
factorial(3);
console.log('-----------------------------------');
//Function Expression
console.log('Function Expression');
var factorial=function(num)
{
    var i,fact=1;
    for(i=1;i<=num;i++)
    {
      fact=fact*i;
    }
    //console.log('Fcatorial is =',fact);
    return fact;
} 
var facto=factorial(3);
console.log('Factorial is =',facto);
console.log('-----------------------------------');
//Self Invoked Function
console.log('Self Invoked Function');
(function(num)
{
    var i,fact=1;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    }
 console.log('factorial =',fact)
}
)
(3)
console.log('-----------------------------------');
//fat Arrow
console.log('Fat Arrow Function');
var factorial=(num)=>
{
    var i,fact=1;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    console.log('factorial is=',fact);
}
factorial(3);