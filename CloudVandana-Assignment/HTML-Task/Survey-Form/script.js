document.getElementById('submitBtn').addEventListener('click', function (e) {
    e.preventDefault();
    if (validateForm()) {
        displayPopup();
    }
});

document.getElementById('resetBtn').addEventListener('click', function () {
    resetForm();
});

document.querySelector('.close').addEventListener('click', function () {
    hidePopup();
    resetForm();
});

function validateForm() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const genderMale = document.getElementById('male').checked;
    const genderFemale = document.getElementById('female').checked;
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    if (
        firstName === '' ||
        lastName === '' ||
        dob === '' ||
        country === '' ||
        !(genderMale || genderFemale) ||
        profession === '' ||
        email === '' ||
        mobile === ''
    ) {
        alert('Please fill in all required fields.');
        return false;
    }

    return true;
}

function displayPopup() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const gender = document.getElementById('male').checked ? 'Male' : 'Female';
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    const popupData = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${gender}</p>
    
            <p><strong>Profession:</strong> ${profession}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Mobile Number:</strong> ${mobile}</p>
        `;
    
        document.getElementById('popupData').innerHTML = popupData;
        document.querySelector('.popup').style.display = 'block';
    }
    
    function hidePopup() {
        document.querySelector('.popup').style.display = 'none';
    }
    
    function resetForm() {
        document.getElementById('surveyForm').reset();
    }
