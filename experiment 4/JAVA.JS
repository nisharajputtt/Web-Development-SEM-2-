function calculateResult(){
    let n = document.getElementById("subjects").value;
    let total=0;
    for(let i=1;i<=n;i++){
        let marks = parseFloat (prompt("Enter marks for subject"+i));
        total=total+marks;
    }
    let average = total/n;
    let grade;
    let result;
    if(average>=90){
        grade ="A+";
    }
    else if(average>=80){
        garde ="A";
    }
    else if(average>=70){
        grade="B";
    }
    else if(average>=60){
        grade="C";
    }
    else{
        grade="D";
    }
    if(average>=40){
        result="pass";
    }
    else{
        result="fail";
    }
    document.getElementById("result").innerHTML="total  "+total+"<br>"
    +"average: "+average +"<br>"
    +"grade: "+grade+"<br>"
    +"result: "+result

}