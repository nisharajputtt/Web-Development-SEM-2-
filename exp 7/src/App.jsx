import './App.css' 
import Student from './assets/Student.jsx' 
 
function App() { 
 
  return ( 
    <div > 
    
      <h2>Student Information</h2> 
 
      <Student name="Nisha" course="B.tech" marks="90" /> 
      <Student name="Palak" course="M.tech" marks="95" /> 
      <Student name="Vaishnavi" course="MCA" marks="99" /> 
    </div> 
  ) 
} 
 
export default App