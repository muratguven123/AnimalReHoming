import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Login from './pages/Login';
import Register from './pages/Register';
import AnimalList from './pages/AnimalList';
import AnimalDetails from './pages/AnimalDetails';
import CaretakerForm from './pages/CaretakerForm';
import Rewards from './pages/Rewards';
import Header from './components/Header';
import Footer from './components/Footer';

const App = () => {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/animals" element={<AnimalList />} />
        <Route path="/animals/:id" element={<AnimalDetails />} />
        <Route path="/add-caretaker" element={<CaretakerForm />} />
        <Route path="/rewards" element={<Rewards />} />
      </Routes>
      <Footer />
    </Router>
  );
};

export default App;