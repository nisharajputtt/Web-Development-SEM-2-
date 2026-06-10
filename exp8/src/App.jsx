import { useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="counter-container">
      <div className="counter-card">

        <div className="counter-title">
          React Counter Application
        </div>

        <div className="counter-value">
          {count}
        </div>

        <div className="button-group">
          <button
            className="increment-btn"
            onClick={() => setCount(count + 1)}
          >
            Increment (+)
          </button>

          <button
            className="decrement-btn"
            onClick={() => {
              if (count === 0) return
              setCount(count - 1)
            }}
          >
            Decrement (-)
          </button>
        </div>

        <div>
          <button
            className="reset-btn"
            onClick={() => setCount(0)}
          >
            Reset
          </button>
        </div>

      </div>
    </div>
  )
}

export default App