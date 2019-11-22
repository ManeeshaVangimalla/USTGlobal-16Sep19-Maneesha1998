var mobiles=['Samsung','Iphone','Oppo','Moto','Redmi'];
console.log('For Loop');
for(var i=0;i<mobiles.length;i++){
    console.log('Mobiles Are =',mobiles[i]);
}
console.log('-------------------------------');
console.log('For of');
for(var element of mobiles){
    console.log('Mobiles Are =',element);
}
console.log('-------------------------------');
console.log('For In');
for(var element in mobiles){
    console.log('Mobiles Are =',mobiles[element]);
}
console.log('-------------------------------');
console.log('For Each Method');
mobiles.forEach(function(value,index)
{
    console.log('Mobiles Are =',value);
})