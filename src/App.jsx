import React from 'react'
import { Route, Routes } from 'react-router-dom'
import Agence from './pages/Agence'
import Home from './pages/Home'
import Project from './pages/Project'
import Navbar from './components/navigation/Navbar'
import Fullscreennav from './components/navigation/Fullscreennav'
import Contact from './pages/Contact'

const App = () => {

   return (
     <div className='overflow-x-hidden text-white'>
      <Navbar/> 
      <Fullscreennav/>
       <Routes>
        <Route path='/' element={<Home/>} />
         <Route path='/agence' element={<Agence/>} />
          <Route path='/projects' element={<Project/>} />
          <Route path='/contact' element={<Contact/>} />
      </Routes> 
    </div>
  )
}

export default App