import React from 'react'
import { useGSAP } from '@gsap/react'
import gsap from 'gsap'
import {useRef} from 'react'
import { useLocation } from 'react-router-dom'

const Stairs = (props) => {
    const currentpath =useLocation().pathname
     const stairparentref = useRef(null)
     const pageref = useRef(null)

      useGSAP(function(){
    const t1 = gsap.timeline()

    t1.to(stairparentref.current,{
      display:'block'
    })

    t1.from('.stair',{
      height:0,
      stagger:{
        amount:-0.25
      }
    })
    t1.to('.stair',{
      y:'100%',
      stagger:{
        amount: -0.25,
      }
    })
    t1.to(stairparentref.current,{
      display:'none'
    })

    t1.to('.stair',{
      y:'0%',
    })
    
    gsap.from(pageref.current,{
        opacity:0,
        delay:1.3,
        scale:1.2
    })
  }, [currentpath])

  console.log(props.children);
  return (
   <div>
      <div  ref={stairparentref} className='h-screen w-full  fixed z-20 top-0'>

       <div  className='h-full w-full flex'>
        <div className='stair h-full w-1/5 bg-black'></div>
        <div className='stair h-full w-1/5 bg-black'></div>
        <div className='stair h-full w-1/5 bg-black'></div>
        <div className='stair h-full w-1/5 bg-black'></div>
        <div className='stair h-full w-1/5 bg-black'></div>
      </div>

     </div>
      <div ref={pageref}>
         {props.children}
      </div>
   </div>

  )
}

export default Stairs