import React, { useState } from "react";
import './App.css'

function App() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [errors, setErrors] = useState({});
  const [success, setSuccess] = useState("");
  const [users, setUsers] = useState([]);

  const handleSubmit = (e) => {
    e.preventDefault();

    let formErrors = {};

    // Name validation
    if (name.trim() === "") {
      formErrors.name = "Name is required";
    }

    // Email validation
    if (!email.includes("@")) {
      formErrors.email = "Email must contain @";
    }

    // Password validation
    if (password.length < 6) {
      formErrors.password =
        "Password must be at least 6 characters";
    }

    setErrors(formErrors);

    // If no errors
    if (Object.keys(formErrors).length === 0) {
      const newUser = {
        name: name,
        email: email,
      };

      // Add new user to users array
      setUsers([...users, newUser]);

      // Success message
      setSuccess("Registration Successful!");

      // Clear form fields
      setName("");
      setEmail("");
      setPassword("");
    }
  };

  return (
    <div className="container">
      <h2>Registration Form</h2>

      <form onSubmit={handleSubmit}>
        {/* Name Input */}
        <input
          type="text"
          placeholder="Enter Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <p className="error">{errors.name}</p>

        {/* Email Input */}
        <input
          type="email"
          placeholder="Enter Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <p className="error">{errors.email}</p>

        {/* Password Input */}
        <input
          type="password"
          placeholder="Enter Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <p className="error">{errors.password}</p>

        <button type="submit">
          Register
        </button>
      </form>

      {/* Success Message */}
      <p className="success">
        {success}
      </p>

      {/* Registered Users */}
      {users.length > 0 && (
        <div className="apiData">
          <h3>Registered Users</h3>

          <ul>
            {users.map((user, index) => (
              <li key={index}>
                {user.name} - {user.email}
              </li>
            ))}
          </ul>
        </div>
      )}
    </div>
  );
}

export default App;