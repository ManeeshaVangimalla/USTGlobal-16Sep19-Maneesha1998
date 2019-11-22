var laptops=['Dell','Hp','Asus','Lenovo','Apple'];
console.log('For Loop');
for(var i=0;i<laptops.length;i++){
    console.log('Laptops Are =',laptops[i]);
}
console.log('--------------------------------------');
console.log('For Of');
for(var element of laptops){
    console.log('Laptops Are =',element);
}
console.log('--------------------------------------');
console.log('For In');
for(var element in laptops){
    console.log('Laptops Are =',laptops[element]);
}
console.log('--------------------------------------');
console.log('For Each Method');
laptops.forEach(function(value,index){
    console.log('Laptops Are =',value);
})