var movies=['Ismartshanker','Dearcomrade','Saaho','Fida'];
console.log('For Loop');
for(var i=0;i<movies.length;i++){
    console.log('Movies Are =',movies[i]);
}
console.log('------------------------------');
console.log('For Of');
for(var element of movies){
    console.log('Movies Are =',element);
}
console.log('---------------------------------');
console.log('For In');
for(var element in movies){
    console.log('Movies Are =',movies[element]);
}
console.log('----------------------------------');
console.log('For Each Method');
movies.forEach(function(value,index){
    console.log('Movies Are =',value);
})