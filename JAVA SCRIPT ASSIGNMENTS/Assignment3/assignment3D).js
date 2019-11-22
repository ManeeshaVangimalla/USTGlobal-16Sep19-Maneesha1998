var dresses=['Tshirts','Chudidar','Skirts','Sarees'];
console.log('For Loop');
for(var i=0;i<dresses.length;i++){
    console.log('Dresses Are =',dresses[i]);
}
console.log('--------------------------------------');
console.log('For Of');
for(var element of dresses){
    console.log('Dresses Are =',element);
}
console.log('--------------------------------------');
console.log('For In');
for(var element in dresses){
    console.log('Dresses Are =',dresses[element]);
}
console.log('----------------------------------------');
console.log('For Each Method');
dresses.forEach(function(value,index)
{
    console.log('Dresses Are =',value);
})