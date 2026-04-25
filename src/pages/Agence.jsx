import { useGSAP } from '@gsap/react'
import gsap from 'gsap'
import { useRef } from 'react'
import { ScrollTrigger } from 'gsap/all'
import React from 'react'

const Agence = () => {

  gsap.registerPlugin(ScrollTrigger)

  const imagedivref = useRef(null)
  const imageref = useRef(null)

  const imagearray=[
    'https://k72.ca/images/teamMembers/Carl_480x640.jpg?w=480&h=640&fit=crop&s=f0a84706bc91a6f505e8ad35f520f0b7',
    'https://k72.ca/images/teamMembers/Olivier_480x640.jpg?w=480&h=640&fit=crop&s=c13569c0753117d04f1a93cf7b446d64',
    'https://k72.ca/images/teamMembers/ChantalG_480x640.jpg?w=480&h=640&fit=crop&s=13093769c4a19cecd291ddcccd898991',
    'https://k72.ca/images/teamMembers/Michele_480X640.jpg?w=480&h=640&fit=crop&s=ce85dc6d140947736baa739d0e59dab2',
    'https://k72.ca/images/teamMembers/MEL_480X640.jpg?w=480&h=640&fit=crop&s=07c9bfee89816720b873e6748a276af6',
    'https://k72.ca/images/teamMembers/CAMILLE_480X640_2.jpg?w=480&h=640&fit=crop&s=74317575b2d72fd11c5296615c383e4a',
    'https://k72.ca/images/teamMembers/MEGGIE_480X640_2.jpg?w=480&h=640&fit=crop&s=3604b19f8fc7b40f517954147698d847',
    'https://k72.ca/images/teamMembers/joel_480X640_3.jpg?w=480&h=640&fit=crop&s=1cadbf143b3aa916b1b414464acbb4d6'
  ]

  useGSAP(function () {
    
    gsap.to(imagedivref.current, {
      scrollTrigger: {
        trigger: imagedivref.current,
       start: 'top 36%',
        end: 'top -70%',
        
        pin: true,
        pinSpacing: true,
        pinReparent:true,
        pinType:'transform',
        scrub: 1,
        
        anticipatePin:1,
        invalidateOnRefresh: true,
        onUpdate: (elem)=>{
          let imageindex;

          if(elem.progress<1){
            imageindex= Math.floor(elem.progress * imagearray.length)
          }else{
             imageindex= imagearray.length-1
          }
          imageref.current.src=imagearray[imageindex]
        }
      }
    })
  })

  return (
    <div>
      <div className='section1 relative py-1'>

        <div
          ref={imagedivref}
          className='absolute overflow-hidden lg:h-[20vw] h-[30vw] lg:rounded-4xl rounded-xl lg:w-[15vw] w-[25vw] lg:top-[96px]  top-[80px] lg:left-[30vw] left-[30vw]'
        >
          <img
             ref={imageref} className='h-full object-cover w-full'
            src="https://k72.ca/images/teamMembers/MEGGIE_480X640_2.jpg?w=480&h=640&fit=crop&s=3604b19f8fc7b40f517954147698d847"
            alt=""
          />
        </div>

        <div className='relative font-[font2]'>

          <div className='lg:mt-[55vh] mt-[30vh] text-center uppercase leading-[15vw]'>

  <h1 className='text-[20vw] '>
    SEVENTY
  </h1>

  <h1 className='text-[20vw] mt-10 lg:mt-0'>
  TWO
</h1>

</div>

          <div className='lg:pl-[40%] lg:mt-20 mt-16 p-3'>
            <p className='lg:text-6xl text-xl leading-tight'>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              Were inquisitive and open-minded, and we make sure creativity crowds out ego from every corner.
              A brand is a living thing, with values, a personality and a story.
              If we ignore that, we can achieve short-term success, but not influence that goes the distance.
              We bring that perspective to every brand story we help tell.
            </p>
          </div>

        </div>

      </div>

      

    </div>
  )
}

export default Agence