import './App.css'
import Student from './Component/Student'



function App() {

  const students = [
    {
      id: 1,
      name: "Rahul",
      course: "Computer Science",
      marks: 89
    },
    {
      id: 2,
      name: "Priya",
      course: "Mathematics",
      marks: 95
    },
    {
      id: 3,
      name: "Amit",
      course: "Physics",
      marks: 78
    }
  ];


  return (
    <div className='border p-10 h-150 w-2xl flex flex-col mx-auto m-20 bg-amber-100'>

    <div className='text-4xl h-20 flex justify-center items-center'>Student Information</div>

      {students.map((student) => (
        <Student key={student.id} block={student} />
      ))}
    </div>
  )
}

export default App
