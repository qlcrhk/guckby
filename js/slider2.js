        // colors와 images 의 갯수를 같게
        // 백그라운드 컬러 저장
document.addEventListener("DOMContentLoaded", () => {

        let colors = ['#ddedd5', '#f9c0c0', '#cde3f5'];
        let images = [
            "http://syp7875.dothome.co.kr/shop/img/mainimg1.png",
            "http://syp7875.dothome.co.kr/shop/img/mainimg2.png",
            "http://syp7875.dothome.co.kr/shop/img/mainimg1_1.jpg"
        ];

        // 현재 컬러와 이미지의 순번 저장
        let currentIndex = 0;

        // interval변수에 setInterval을 저장함
        // 이전 이후 버튼 클릭시 시간을 초기화 시킨후 실행하기 위함
        let interval;
        let startX; // 마우스 시작 X 좌표
        let endX; // 마우스 끝 X 좌표

        // Function to update the slide
        function updateSlide() {
            document.querySelector('.slide-container').style.backgroundColor = colors[currentIndex];
            document.querySelector('.slide-img').style.backgroundImage = `url('${images[currentIndex]}')`;
        }

        // Set the initial background image and color
        updateSlide();

        // Event listener for previous button
        document.querySelector('.prev-btn').addEventListener('click', () => {
            currentIndex = (currentIndex - 1 + colors.length) % colors.length; // Go to the previous index
            updateSlide(); // Update the slide
            resetInterval(); // Reset the interval
        });

        // Event listener for next button
        document.querySelector('.next-btn').addEventListener('click', () => {
            currentIndex = (currentIndex + 1) % colors.length; // Go to the next index
            updateSlide(); // Update the slide
            resetInterval(); // Reset the interval
        });

        // Function to start the interval
        function startInterval() {
            interval = setInterval(() => {
                currentIndex = (currentIndex + 1) % colors.length; // Increment index
                updateSlide(); // Update the slide
            }, 2500);
        }

        // Function to reset the interval
        function resetInterval() {
            clearInterval(interval); // Clear the existing interval
            startInterval(); // Start a new interval
        }

        // Start the interval when the page loads
        startInterval();

        // Mouse down event to store starting X coordinate
        document.querySelector('.slide-container').addEventListener('mousedown', (event) => {
            startX = event.clientX; //사용자가 클릭한 화면의 x위치
        });

        // Mouse up event to detect the end position and calculate distance
        document.querySelector('.slide-container').addEventListener('mouseup', (event) => {
            endX = event.clientX; //사용자가 마우스를 떘을 때 위치
            const distance = endX - startX; //결과값을 저장 +면 이전으로 -면 다음으로 진행

            if (distance > 50) {
                // Move to the previous slide
                currentIndex = (currentIndex - 1 + colors.length) % colors.length;
                updateSlide(); // Update the slide
                resetInterval(); // Reset the interval
            } else if (distance < -50) {
                // Move to the next slide
                currentIndex = (currentIndex + 1) % colors.length;
                updateSlide(); // Update the slide
                resetInterval(); // Reset the interval
            }
        });
});