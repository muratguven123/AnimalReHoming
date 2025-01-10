import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => {
  return (
    <nav>
      <div className="nav-logo">Animal ReHoming</div>
      <ul className="nav-links">
        <li><Link to="/">Home</Link></li>
        <li><Link to="/animals">Animals</Link></li>
        <li><Link to="/add-caretaker">Add Caretaker</Link></li>
        <li><Link to="/rewards">Rewards</Link></li>
        <li><Link to="/login">Login</Link></li>
      </ul>
    </nav>
  );
};

export default Header;