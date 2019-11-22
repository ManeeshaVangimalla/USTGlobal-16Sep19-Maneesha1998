var places=['Goa','Switzrland','Paris','Newyork','France'];
console.log('For Loop');
for(var i=0;i<=places.length;i++)
{
    console.log('Places Are =',places[i]);
}
console.log('---------------------------------');
console.log('For Of');
for(var element of places)
{
    console.log('Places Are =',element);
}
console.log('----------------------------------');
console.log('For In');
for(var element in places)
{
    console.log('Places Are =',places[element]);
}
console.log('----------------------------------');
console.log('For Each Method');
places.forEach(function(value,index){
    console.log('Places Are =',value);
});