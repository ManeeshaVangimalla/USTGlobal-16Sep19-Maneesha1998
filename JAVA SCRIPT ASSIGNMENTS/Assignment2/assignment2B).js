//Named Functions
var fab = function(num)
    {
            var f1=0;
            var f2=1;
            console.log(f1);
            console.log(f2);
            for(var i = 0 ; i < num ; i++){
                var f3 = f1+f2;
                
                if(f3<=num){
                    console.log(f3); 
                    f1=f2;
                    f2=f3;
                }
            }
    }
    var result = fab(6);
    console.log('------------------------------------');
    //function expression
var fab=function(num){
    var f1=0;
    var f2=1;
    console.log(f1);
    console.log(f2);
    for(var i=0;i<num;i++){
        var f3=f1+f2;
        if(f3<=num){
            console.log(f3);
            f1=f2;
            f2=f3;
        }
    }
}
  var result=fab(6);
  console.log('------------------------------------');
  //self invoked function
  (function(num)
  {
      var f1=0;
      var f2=1;
      console.log(f1);
    console.log(f2);
    for(var i=0;i<num;i++){
        var f3=f1+f2;
        if(f3<=num){
            console.log(f3);
            f1=f2;
            f2=f3;
        }
    }
  })(6);
  console.log('------------------------------------');
  //fat arrow function
  var fib=(num)=>{
    var f1=0;
    var f2=1;
    console.log(f1);
  console.log(f2);
  for(var i=0;i<num;i++){
      var f3=f1+f2;
      if(f3<=num){
          console.log(f3);
          f1=f2;
          f2=f3;
      }
    }
  }
  fib(6);