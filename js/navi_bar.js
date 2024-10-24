document.addEventListener('DOMContentLoaded', () => {
    const hamburger = document.querySelector('.hamburger');
    const navMenuMobile = document.querySelector('.nav_menu_mobile');
    const mainContainer = document.querySelector('.carousel');
    const brandContainer = document.querySelector('.brand_container');

    if (hamburger && navMenuMobile && mainContainer && brandContainer) {
        // Click anywhere outside the hamburger or navMenuMobile to close the mobile menu
        document.addEventListener('click', (event) => {
            if (!hamburger.contains(event.target) && !navMenuMobile.contains(event.target)) {
                navMenuMobile.classList.remove("show");
                mainContainer.classList.remove("buler");
                brandContainer.classList.remove("buler");
            }
        });

        // Prevent body click event when clicking inside hamburger or navMenuMobile
        hamburger.addEventListener('click', (event) => {
            event.stopPropagation(); // Stop click event propagation from hamburger
            navMenuMobile.classList.toggle("show");
            mainContainer.classList.toggle("buler");
            brandContainer.classList.toggle("buler");
        });

        navMenuMobile.addEventListener('click', (event) => {
            event.stopPropagation(); // Stop click event propagation from navMenuMobile
        });
    }

    // Reset blur and hide mobile menu when window is resized beyond 600px
    window.addEventListener('resize', () => {
        if (window.innerWidth > 700 && navMenuMobile && mainContainer && brandContainer) {
            navMenuMobile.classList.remove("show");
            mainContainer.classList.remove("buler");
            brandContainer.classList.remove("buler");
        }
    });
});
