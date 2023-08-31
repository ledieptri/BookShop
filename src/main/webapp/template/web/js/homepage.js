//--HomePageImage-Left---Next,Back
const homePageImage = document.querySelector(".homepage-left-img");
const homePageImageNext = document.querySelector(".homepage-left-icon-next")
const homePageImageBack = document.querySelector(".homepage-left-icon-back")
const arraySrc = ["https://cdn0.fahasa.com/media/wysiwyg/Thang-05-2023/SaleT3_LDP_BannerM_1920x800.jpg","https://cdn0.fahasa.com/media/wysiwyg/Thang-04-2023/ZaloPayT523_1920x400_Banner%20LDP.jpg","https://cdn0.fahasa.com/media/magentothem/banner7/DinhTi_T5_Slide_840x320.jpg"]
homePageImageNext.addEventListener("click",handleNextSrc);
let countSrc = 0;
function handleNextSrc(event) {
    countSrc = countSrc + 1;
    if(countSrc > 2){
        countSrc = 0;
    }
    homePageImage.setAttribute("src",arraySrc[countSrc]);
    
}
homePageImageBack.addEventListener("click",handleBackSrc);
function handleBackSrc(event) {
    countSrc = countSrc - 1;
    if(countSrc < 0){
        countSrc = 2;
    }
    homePageImage.setAttribute("src",arraySrc[countSrc]);
    
}

const timer = setInterval(function(){
    handleNextSrc();
},5500);