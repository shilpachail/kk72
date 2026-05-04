import React, { useEffect, useRef, useContext } from "react";
import gsap from "gsap";
import { NavbarContext } from "../context/Navcontext";

const Contact = () => {
  const stripRef = useRef(null);
  const [navOpen] = useContext(NavbarContext);

  useEffect(() => {
    if (navOpen) return; // 🔥 stop animation when menu open

    gsap.to(".marquee", {
      xPercent: -100,
      repeat: -1,
      duration: 18, // 🔥 slower (was 10)
      ease: "linear",
    });
  }, [navOpen]);

  return (
    <div className="bg-black text-white min-h-screen overflow-hidden">

      {/* HEADER */}
      <div className="flex justify-between p-5">
        
       
      </div>

      {/* 🔥 HIDE CONTENT WHEN NAV OPEN */}
      {!navOpen && (
        <>
          {/* MAIN TEXT */}
          <div className="flex flex-col items-center justify-center text-center mt-20 px-4">
            <h1 className="text-4xl sm:text-6xl lg:text-[8vw] font-bold leading-[1.1]">
              LET’S BUILD <br /> SOMETHING <br /> GREAT
            </h1>

            <p className="text-gray-400 mt-6 text-sm sm:text-base">
              Got an idea or project in mind? <br />
              Let’s make it happen.
            </p>
          </div>

          {/* CONTACT INFO */}
          <div className="flex flex-col sm:flex-row justify-center items-center gap-8 mt-12 text-center text-sm">
            <div>
              <p className="text-gray-400">EMAIL</p>
              <p>shilpachail@gmail.com</p>
            </div>

            <div>
              <p className="text-gray-400">PHONE</p>
              <p>+91 XXXXX XXXXX</p>
            </div>

            <div>
              <p className="text-gray-400">LOCATION</p>
              <p>Kolkata, India</p>
            </div>
          </div>

          {/* 🔥 PERFECT STRIP */}
          <div className="relative mt-16 overflow-hidden group cursor-pointer">

            {/* ⚠️ NO ROTATE HERE → FIX UNEVEN LINE */}
            <div
              ref={stripRef}
              className="
                bg-[#D3FD50] text-black flex whitespace-nowrap
                group-hover:bg-black group-hover:text-[#D3FD50]
                transition-all duration-500
                text-[5vw] sm:text-[3vw] lg:text-[2vw]
                font-bold uppercase
                py-4
              "
            >
              {/* BLOCK 1 */}
              <div className="marquee flex items-center gap-12 px-10">
                {Array.from({ length: 10 }).map((_, i) => (
                  <React.Fragment key={i}>
                    <span>HELLO@GMAIL.COM</span>
                    <span>•</span>
                    <span>LET’S CONNECT</span>
                    <span>•</span>
                  </React.Fragment>
                ))}
              </div>

              {/* BLOCK 2 */}
              <div className="marquee flex items-center gap-12 px-10">
                {Array.from({ length: 10 }).map((_, i) => (
                  <React.Fragment key={i}>
                    <span>HELLO@GMAIL.COM</span>
                    <span>•</span>
                    <span>LET’S CONNECT</span>
                    <span>•</span>
                  </React.Fragment>
                ))}
              </div>

            </div>
          </div>

          {/* SOCIAL */}
          <div className="mt-20 text-center">
            <p className="mb-4">FOLLOW ME</p>
            <div className="flex justify-center gap-4 flex-wrap">
              {["FB", "IG", "IN", "GH"].map((item, i) => (
                <div
                  key={i}
                  className="border border-white px-4 py-2 rounded-full text-sm"
                >
                  {item}
                </div>
              ))}
            </div>
          </div>
        </>
      )}

    </div>
  );
};

export default Contact;