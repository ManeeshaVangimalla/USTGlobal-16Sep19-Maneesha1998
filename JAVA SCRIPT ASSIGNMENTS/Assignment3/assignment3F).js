var bikes=['Suziki','Pulsur','Yamaha','Fzs','Bajaj'];
console.log('For Loop');
for(var i=0;i<bikes.length;i++){
    console.log('Bikes Are =',bikes[i]);
}
console.log('------------------------------------');
console.log('For Of');
for(var element of bikes){
    console.log('Bikes Are =',element);
}
console.log('------------------------------------');
console.log('For In');
for(var element in bikes){
    console.log('Bikes Are =',bikes[element]);
}
console.log('------------------------------------');
console.log('For Each Method');
bikes.forEach(function(value,index){
    console.log('Bikes Are =',value);
})