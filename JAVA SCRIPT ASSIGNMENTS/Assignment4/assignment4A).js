const numbers=[2,4,6,8,9,5];
numbers.forEach(function(value,index){
    console.log('Numbers Are =',value);
})
console.log('---------------------------------------');
const numbers1 = Array.isArray(numbers)
console.log('Is Array or Not =',numbers1);
const numbers2 = numbers.includes(5,2)
console.log('Number is There or Not =' ,numbers2);
const numbers3 = numbers.push(1);
console.log('After Push =',numbers3);
const numbers4 = numbers.pop();
console.log('After Pop =' ,numbers4);
const numbers5 = numbers.unshift(45,89);
console.log('After Unshift Method =',numbers5);
const numbers6 = numbers.shift();
console.log('After Shift Method =',numbers6);
const numbers7 = numbers.splice(1,2,23,8);
console.log('After Splice Method');
const numbers8 = numbers.slice(1,2);
console.log("After Slice Method ",numbers8);
const numbers9 = numbers.indexOf(1,2);
console.log('After Indexof Method ',numbers9);
const numbers10 = numbers.join('-');
console.log('After join Method',numbers10);
console.log('-----------------------------------------------');
const fruits = ['Grapes','Apple','Lemon','Mango']
fruits.forEach(function(value,index){
    console.log('Fruits = ',value)
})
console.log('---------------------------------------------------');
const fruit1 = Array.isArray(fruits)
console.log('Is Array or Not = ',fruit1)
const fruit2 = fruits.includes('Apple',1)
console.log('Includes or Not = ',fruit2)
const fruit3 = fruits.push('Sapota')
console.log('After Push Method = ',fruit3)
const fruit4 = fruits.pop()
console.log('After Pop Method = ',fruit4)
const fruit5 = fruits.unshift('Pineapple')
console.log('After Unshift Method = ',fruit5)
const fruit6 = fruits.shift()
console.log('After Shift Method = ',fruit6)
const fruit7 = fruits.splice(1,3,'Kiwi','Pineapple')
console.log('After splice Method = ',fruit7)
const fruit8 = fruits.slice(1,2)
console.log('After Slice Method = ',fruit8)
const fruit9 = fruits.indexOf('Mango',2)
console.log('After IndexOf Method = ',fruit9)
const fruit10 = fruits.join('-')
console.log('After Join Method = ',fruit10)
console.log('------------------------------------------------');
const mobiles = ['Samsung','Lenovo','Oppo','Moto'];
mobiles.forEach(function(value,index){
    console.log('Mobiles = ',value)
})
console.log('-------------------------------------------------');
const mobile1 = Array.isArray(mobiles)
console.log('Is Array or Not = ',mobile1)
const mobile2 = mobiles.includes('Redmi',1)
console.log('Includes or Not = ',mobile2)
const mobile3 = mobiles.push('Realme')
console.log('After Push Method = ',mobile3)
const mobile4 = mobiles.pop()
console.log('After Pop Method = ',mobile4)
const mobile5 = mobiles.unshift('Oneplus','Iphone')
console.log('After Unshift Method = ',mobile5)
const mobile6 = mobiles.shift()
console.log('After Shift Method = ',mobile6)
const mobile7 = mobiles.splice(1,3,'Honor','Iphone')
console.log('After splice Method = ',mobile7)
const mobile8 =mobiles.slice('Realme',1)
console.log('After Slice Method = ',mobile8)
const mobile9 = mobiles.indexOf('Oppo',0)
console.log('After IndexOf Method = ',mobile9)
const mobile10 = mobiles.join('-')
console.log('After Join Method = ',mobile10)
console.log('---------------------------------------------');
const subjects = ['Maths','Science']
subjects.forEach(function(value,index){
    console.log('subjects = ',value)
})
console.log('-------------------------------------------------');
const subject1 = Array.isArray(subjects)
console.log('Is Array or Not = ',subject1)
const subject2 = subjects.includes('Science',1)
console.log('Includes or Not = ',subject2)
const subject3 = subjects.push('Social')
console.log('After Push Method = ',subject3)
const subject4 = subjects.pop()
console.log('After Pop Method = ',subject4)
const subject5 = subjects.unshift('English','Telugu')
console.log('After Unshift Method = ',subject5)
const subject6 = subjects.shift()
console.log('After Shift Method = ',subject6)
const subject7= subjects.splice(1,3,'Java','Social')
console.log('After splice Method = ',subject7)
const subject8= subjects.slice('Science',1)
console.log('After Slice Method = ',subject8)
const subject9 = subjects.indexOf('English',0)
console.log('After IndexOf Method = ',subject9)
const subject10 = subjects.join(',')
console.log('After Join Method = ',subject10);
console.log('--------------------------------------------');
const vegs = ['Carrot','Raddish','Cabage']
vegs.forEach(function(value,index){
    console.log('Vegitables = ',value)
})
console.log('---------------------------------------------');
const veg = Array.isArray(vegs)
console.log('Is Array or Not = ',veg)
const veg1 = vegs.includes('Raddish',1)
console.log('Includes or Not = ',veg1)
const veg2 = vegs.push('Drumstick')
console.log('After Push Method = ',veg2)
const veg3 = vegs.pop()
console.log('After Pop Method = ',veg3)
const veg4 = vegs.unshift('Onion','Beetroot')
console.log('After Unshift Method = ',veg4)
const veg5 = vegs.shift()
console.log('After Shift Method = ',veg5)
const veg6 = vegs.splice(1,3,'Garlic','Onion')
console.log('After splice Method = ',veg6)
const veg7 = vegs.slice(1,2)
console.log('After Slice Method = ',veg7)
const veg8 = vegs.indexOf('Mango',2)
console.log('After IndexOf Method = ',veg8)
const veg9 = vegs.join('-')
console.log('After Join Method = ',veg9)
console.log('-------------------------------------------');
const cloths = ['Traditional','Western','Simple']
cloths.forEach(function(value,index){
    console.log('Clothes = ',value)
})
console.log('-----------------------------------------------');
const cloth = Array.isArray(cloths)
console.log('Is Array or Not = ',cloth)
const cloth1 = cloths.includes('Simple',1)
console.log('Includes or Not = ',cloth1)
const cloth2 = cloths.push('NightDresses')
console.log('After Push Method = ',cloth2)
const cloth3 = cloths.pop()
console.log('After Pop Method = ',cloth3)
const cloth4 = cloths.unshift('DailyWear','FunctionWear')
console.log('After Unshift Method = ',cloth4)
const cloth5 = cloths.shift()
console.log('After Shift Method = ',cloth5)
const cloth6 = cloths.splice(1,3,'Sportsdress','NightDresses')
console.log('After splice Method = ',cloth6)
const cloth7 = cloths.slice(1,2)
console.log('After Slice Method = ',cloth7)
const cloth8 = cloths.indexOf('Simple',1)
console.log('After IndexOf Method = ',cloth8)
const cloth9 = cloths.join('-')
console.log('After Join Method = ',cloth9)
console.log('------------------------------------------------');
const names = ['Sai','Sri','Hema','Harika']
names.forEach(function(value,index){
    console.log('names = ',value)
})
console.log('----------------------------------------------------');
const name = Array.isArray(names)
console.log('Is Array or Not = ',name)
const name1 = names.includes('Sri',1)
console.log('Includes or Not = ',name1)
const name2 = names.push('Suchi')
console.log('After Push Method = ',name2)
const name3 = names.pop()
console.log('After Pop Method = ',name3)
const name4 = names.unshift('Janu','Pranu')
console.log('After Unshift Method = ',name4)
const name5 = names.shift()
console.log('After Shift Method = ',name5)
const name6 = names.splice(1,3,'Mouni','Harika')
console.log('After splice Method = ',name6)
const name7 = names.slice(1,2)
console.log('After Slice Method = ',name7)
const name8 = names.indexOf('Mouni',1)
console.log('After IndexOf Method = ',name8)
const name9 = names.join('-')
console.log('After Join Method = ',name9)
console.log('--------------------------------------');
const days = ['Mon','Tue','Wed']
days.forEach(function(value,index){
    console.log('days = ',value)
})
console.log('---------------------------------------');
const day = Array.isArray(days)
console.log('Is Array or Not = ',day)
const day1 = days.includes('Tue',1)
console.log('Includes or Not = ',day1)
const day2 = days.push('Thu')
console.log('After Push Method = ',day2)
const day3 = days.pop()
console.log('After Pop Method = ',day3)
const day4 = days.unshift('Fri','Sat')
console.log('After Unshift Method = ',day4)
const day5 = days.shift()
console.log('After Shift Method = ',day5)
const day6 = days.splice(1,3,'Sun','Fri')
console.log('After splice Method = ',day6)
const day7 = days.slice('Wed',1)
console.log('After Slice Method = ',day7)
const day8 = days.indexOf('Thu',0)
console.log('After IndexOf Method = ',day8)
const day9 = days.join('-')
console.log('After Join Method = ',day9)
console.log('--------------------------------------');
const colors = ['Red','Blue','Green']
colors.forEach(function(value,index){
    console.log('days = ',value)
})
console.log('-------------------------------------');
const color = Array.isArray(colors)
console.log('Is Array or Not = ',color)
const color1 = colors.includes('Blue',1)
console.log('Includes or Not = ',color1)
const color2 = colors.push('Orange')
console.log('After Push Method = ',color2)
const color3 = colors.pop()
console.log('After Pop Method = ',color3)
const color4 = colors.unshift('Grey','Black')
console.log('After Unshift Method = ',color4)
const color5 = colors.shift()
console.log('After Shift Method = ',color5)
const color6 = colors.splice(1,3,'White','Green')
console.log('After splice Method = ',color6)
const color7 = colors.slice('Blue',1)
console.log('After Slice Method = ',color7)
const color8 = colors.indexOf('Red',0)
console.log('After IndexOf Method = ',color8)
const color9 = colors.join(',')
console.log('After Join Method = ',color9)
console.log('-----------------------------------------');
const months = ['Jan','Feb','March']
months.forEach(function(value,index){
    console.log('days = ',value)
})
console.log('--------------------------------------');
const month = Array.isArray(months)
console.log('Is Array or Not = ',month)
const month1 = months.includes('Blue',1)
console.log('Includes or Not = ',month1)
const month2 = months.push('April')
console.log('After Push Method = ',month2)
const month3 = months.pop()
console.log('After Pop Method = ',month3)
const month4 = months.unshift('May','June')
console.log('After Unshift Method = ',month4)
const month5 = months.shift()
console.log('After Shift Method = ',month5)
const month6 = months.splice(1,3,'July','May')
console.log('After splice Method = ',month6)
const month7 = months.slice('Feb',1)
console.log('After Slice Method = ',month7)
const month8 = months.indexOf('June',0)
console.log('After IndexOf Method = ',month8)
const month9 = months.join(',')
console.log('After Join Method = ',month9)
