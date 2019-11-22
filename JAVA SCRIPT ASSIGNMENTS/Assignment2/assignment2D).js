//Named Functions
console.log('Named Function');
function add(a) {
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    } 
    console.log('The Sum Of Elements In Array Is:',sum);
}
var a = [10,20,30];
add(a);
console.log('------------------------------------------');
//Function Expression
console.log('Function Expression');
var add = function(a){
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    }
    console.log('The Sum Of Elements In Array Is:',sum);
    return sum;
}
var a = [10,20,30];
var result = add(a);
console.log('--------------------------------------------');
//Self Invoked Function
console.log('Self Invoked Function');
var a = [10,20,30];
(function(a){
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    } 
    console.log('The Sum Of Elements In Array Is:',sum); 
})(a);
console.log('------------------------------------------');
//Fat Arrow Function
console.log('Fat Arrow Function');
var a = [10,20,30];
var array = (a) => {
    var sum = 0;
    for(var i = 0;i<a.length;i++){
        sum = a[i]+sum;
    }
console.log('The Sum Of Elements In Array Is:',sum);
}
array(a);