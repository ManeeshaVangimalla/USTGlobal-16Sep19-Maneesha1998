var choclates=['Dairymilk','Munch','Perk','Kitkat','5star'];
console.log('For Loop');
for(var i=0;i<choclates.length;i++)
{
    console.log('Choclates Are =',choclates[i]);
}
console.log('---------------------------------');
console.log('For Of');
for(var element of choclates){
    console.log('Choclates Are =',element);
}
console.log('----------------------------------');
console.log('For In');
for(var element in choclates){
    console.log('Choclates Are =',choclates[element]);
}
console.log('-----------------------------------');
console.log('For Each Method');
choclates.forEach(function(value,index){
    console.log('Choclates Are =',value);
})
