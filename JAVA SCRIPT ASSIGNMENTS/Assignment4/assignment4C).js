const items=[{
    name:'Earrings',
    id:1,
    price:5000
  },
  {
      name:'Kajal',
      id:2,
      price:1000
  },
  {
      name:'Trimmer',
      id:3,
      price:3000
  },
  {
      name:'Beardo',
      id:4,
      price:170
  }
]
//Map Method//
console.log('Map Method');
const updatedItem=items.map(function(item,index)
{
    item.price = item.price+300;
    return item;
})
console.log(updatedItem)
console.log('--------------------------------------');
//Filter//
console.log('Filter')
const updatedFilter=items.filter((item)=>item.price>1000)
console.log(updatedFilter)