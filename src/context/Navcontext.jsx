import React, { createContext,useState , useEffect} from 'react'
export const NavbarContext = createContext()
export const NavbarColorContext= createContext()
import{useLocation} from 'react-router-dom'

const Navcontext = ({children}) => {
    const [navColor,setnavColor] = useState('white')
    const [navOpen, setNavOpen] =useState(false)

    const[locate] = useLocation().pathname
    useEffect(function(){
        if(locate=='/projects' || locate=='/agence'){
            setnavColor('black')
        } else{
            setnavColor('white')
        }
    },[locate])
  return (
    <div>
        <NavbarContext.Provider value ={ [navOpen, setNavOpen]}>
           <NavbarColorContext.Provider value={[navColor,setnavColor]}>
             {children}
           </NavbarColorContext.Provider>
        </NavbarContext.Provider>
    </div>
  )
 }

export default Navcontext