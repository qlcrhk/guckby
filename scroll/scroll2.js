let state = true;
const gnb = document.querySelector('nav');

document.addEventListener('scroll',()=>{
    console.log(window.scrollY);
    if( window.scrollY >= 500 && state){
        state = false;
        gnb.classList.add('active');
    }else if(window.scrollY < 500){
        state = true;
        gnb.classList.remove('active');
    }
})
