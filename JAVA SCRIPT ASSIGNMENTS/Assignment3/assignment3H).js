var friends=['Maneesha','Chaitu','Pravs','Prani',];
console.log('For Loop');
for(var i=0;i<friends.length;i++){
    console.log('Friends =',friends[i]);
}
console.log('----------------------------------');
console.log('For Of');
for(var element of friends){
    console.log('Friends =',element);
}
console.log('----------------------------------');
console.log('For In');
for(var element in friends){
    console.log('Friends =',friends[element]);
}
console.log('----------------------------------');
console.log('For Each Method');
friends.forEach(function(value,index){
    console.log('Friends Are =',value);
})