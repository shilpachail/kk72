import React from 'react'
import Videos from '../components/home/Videos'
import Homeherotext from '../components/home/Homeherotext'
import Homebottomtexts from '../components/home/Homebottomtexts'

const Home = () => {
  return (
    <div>
      <div className= 'h-screen w-screen fixed'>
       <Videos/>
      </div>
      <div className= 'h-screen  w-screen relative pb-5 overflow-hidden flex flex-col justify-between'>
        <Homeherotext/>
        <Homebottomtexts/>
      </div>
    </div>
  )
}

export default Home