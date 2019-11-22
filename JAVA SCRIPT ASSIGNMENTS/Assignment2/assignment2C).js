//Named Functions
console.log('Named Functions')
function circum(num){
    var r;
     var circum=2*Math.PI*num;
     console.log('circumference',circum);
 }
circum(2);
console.log('---------------------------------');
//Function Expression
console.log('Function Expression');
var a = function(num){
    var r;
    var circum=2*Math.PI*num;
    console.log('circumference',circum);
    //var round_value = Math.round(4.4);
    //console.log('round',round_value);
    return circum;
}
 var result = circum(2);
 console.log('result',result); 
 console.log('----------------------------------------');
 //Sefl Invoked Function
 console.log('Self Invoked Function');
(function circum(num){
    var r;
    var circum=2*Math.PI*num;
    console.log('circumference',circum);
})(2);
console.log('---------------------------------------');
//Fat Arrow Function
console.log('Fat Arrow Function');
var circum = (num) =>{
    var r;
     var circum=2*Math.PI*num;
     console.log('circumference',circum); 
}
circum(4);
