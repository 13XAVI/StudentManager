const form = document.getElementById('signup');
const name = document.getElementById('name');
const email = document.getElementById('email');
const password = document.getElementById('password');
const confirmPassword = document.getElementById('confirm-password');
const nameError = document.getElementById('name-error');
const emailError = document.getElementById('email-error');
const passwordError = document.getElementById('password-error');
const confirmPasswordError = document.getElementById('confirm-password-error');


function success() {
    alert('You have successfully signed up');
}
function validateName() {
    if (name.value === '') {
        nameError.textContent = 'Please enter your name';
        return false;
    }
    return true;
}

function validateEmail() {
    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailRegex.test(email.value)) {
        emailError.textContent = 'Please enter a valid email address';
        return false;
    }
    return true;
}

function validatePassword() {
    if (password.value.length < 6) {
        passwordError.textContent = 'Password must be at least 6 characters';
        return false;
    }
    return true;
}

function validateConfirmPassword() {
    if (confirmPassword.value !== password.value) {
        confirmPasswordError.textContent = 'Passwords do not match';
        return false;
    }
    return true;
}


form.addEventListener('submit', function (event) {
    nameError.textContent = '';
    emailError.textContent = '';
    passwordError.textContent = '';
    confirmPasswordError.textContent = '';

    const isNameValid = validateName();
    const isEmailValid = validateEmail();
    const isPasswordValid = validatePassword();
    const isConfirmPasswordValid = validateConfirmPassword();

    if (!isNameValid || !isEmailValid || !isPasswordValid || !isConfirmPasswordValid) {
        event.preventDefault();
    }
});


const translations = {
    en: {
        name: "Sign Up Page",
        title: "Sign Up Form",
        description: "Please fill this form with accurate information",
        email: "Email",
        password: "Password",
        confirm_passowrd: "Confirm Password",
        sign_up: "Sign Up"

    },
    fr: {
        name: "Page d'inscription",
        title: "Formulaire d'inscription",
        description: "Veuillez remplir ce formulaire avec des informations exactes",

        email: "Email",
        password: "Mot de passe",
        confirm_passowrd: "Confirmez le mot de passe",
        sign_up: "S'inscrire"

    },
    kin: {
        name: "Urupapuro rwo kwiyandikisha",
        title: "Ifishi yo kwiyandikisha",
        description: "Nyamuneka wuzuze iyi fomu n\'amakuru yukuri",

        email: "Imeri",
        password: "Ijambobanga",
        confirm_passowrd: "Emeza ijambo ryibanga",
        sign_up: "Iyandikishe"


    }
};
// function to update all elements with translations
function updateTranslations(lang) {
    // get all elements with a data-i18n attribute
    const elements = document.querySelectorAll("[data-i18n]");
    // loop through all elements and update their text
    for (let element of elements) {
        const key = element.getAttribute("data-i18n");
        element.textContent = translations[lang][key];
    }
    // update navigation links
    const navLinks = document.querySelectorAll("[data-i18n-nav]");
    for (let link of navLinks) {
        const key = link.getAttribute("data-i18n-nav");
        link.textContent = translations[lang].nav[key];
    }
}

// function to get the current language from the select element
function getCurrentLanguage() {
    const select = document.getElementById("language-select");
    return select.value;
}

// function to set the current language to a new value
function setCurrentLanguage(lang) {
    const select = document.getElementById("language-select");
    select.value = lang;
}

// add event listener to update translations when select value changes
const select = document.getElementById("language-select");
select.addEventListener("change", () => {
    const lang = getCurrentLanguage();
    updateTranslations(lang);
});


function changeLanguage() {
    var selectElement = document.getElementById("language-select");
    var selectedValue = selectElement.options[selectElement.selectedIndex].value;
}




// set initial language based on the select element value
const lang = getCurrentLanguage();
updateTranslations(lang);
