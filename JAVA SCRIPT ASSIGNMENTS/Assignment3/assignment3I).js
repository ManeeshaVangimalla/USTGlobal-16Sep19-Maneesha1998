var cooldrinks=['Sprite','Coke','Pepsi','Thumsup','Dew'];
console.log('For Loop');
for(var i=0;i<cooldrinks.length;i++){
    console.log('Cooldrinks Are =',cooldrinks[i]);
}
console.log('-----------------------------------------');
console.log('For Of');
for(var element of cooldrinks){
    console.log('Cooldrinks Are =',element);
}
console.log('-----------------------------------------');
console.log('For In');
for(var element in cooldrinks){
    console.log('Cooldrinks Are =',cooldrinks[element]);
}
console.log('-----------------------------------------');
console.log('For Each Method');
cooldrinks.forEach(function(value,index){
    console.log('Cooldrinks Are =',value);
})