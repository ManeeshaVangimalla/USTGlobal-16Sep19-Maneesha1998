var numbers=[46,76,43,89,90];
console.log('For Loop');
for(var i=0;i<numbers.length;i++)
{
    console.log('Numbers Are =',numbers[i]);
}
console.log('------------------------------');
console.log('For Of');
for(var element of numbers){
    console.log('Numbers Are =',element);
}
console.log('--------------------------------');
console.log('For In');
for(var element in numbers){
    console.log('Numbers Are =',numbers[element]);
}
console.log('----------------------------------');
console.log('For Each Method');
numbers.forEach(function(value,index){
    console.log('Numbers Are =',value);
})