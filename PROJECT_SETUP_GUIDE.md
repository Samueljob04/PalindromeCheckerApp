# PalindromeCheckerApp - Complete Setup Guide

**Student Roll No:** RA2411030010116  
**Project Name:** PalindromeCheckerApp  
**Date:** March 2, 2026

## ✅ Project Status: READY FOR GITHUB

---

## 📁 Current Project Structure
```
RA2411030010116/
└── PalindromeCheckerApp/
    ├── .git/                    (Git repository initialized)
    ├── .gitignore               (Java ignore rules)
    ├── README.md                (Project documentation)
    ├── PROJECT_SETUP_GUIDE.md   (This file)
    └── App/
        └── src/
            └── PalindromeCheckerApp.java
```

---

## 🎯 What Has Been Completed

### ✅ Local Setup (DONE)
- [x] Created folder with Roll No: RA2411030010116
- [x] Created PalindromeCheckerApp repository locally
- [x] Created App module with src folder
- [x] Created PalindromeCheckerApp.java with all 3 use cases
- [x] Initialized Git repository
- [x] Created feature branches for each use case
- [x] Committed all changes with proper messages

### ✅ Git Commits (DONE)
```
* 6015d52 (HEAD -> main) UC3: User Input Palindrome Check with interactive interface
* 1e6af81 UC2: Hard Code Palindrome Check
* 4a50d28 Initial commit: Project setup with README
```

### ✅ Git Branches (CREATED)
- main (current)
- UC1-WelcomeMessage
- UC2-HardCodePalindrome
- UC3-UserInputPalindrome

---

## 🚀 Next Steps: Push to GitHub

### Step 1: Create GitHub Repository
1. Go to https://github.com
2. Click the **"+"** icon → **"New repository"**
3. Repository name: `PalindromeCheckerApp`
4. ✅ Check "Add a README file" (you already have one locally)
5. Keep it Public or Private (your choice)
6. Click **"Create repository"**

### Step 2: Connect Local to Remote
Open terminal in this directory and run:

```bash
# Navigate to project
cd /Users/samuelpaul/Documents/RA2411030010116/PalindromeCheckerApp

# Add remote origin (replace YOUR_USERNAME with your GitHub username)
git remote add origin https://github.com/YOUR_USERNAME/PalindromeCheckerApp.git

# Push all branches to GitHub
git push -u origin main
git push origin UC1-WelcomeMessage
git push origin UC2-HardCodePalindrome
git push origin UC3-UserInputPalindrome
```

---

## 🔧 Opening in IntelliJ IDEA

### Method 1: From IntelliJ
1. Open IntelliJ IDEA
2. Click **"File"** → **"Close Project"** (if any project is open)
3. Click **"Open"**
4. Navigate to: `/Users/samuelpaul/Documents/RA2411030010116/PalindromeCheckerApp`
5. Select the folder and click **"Open"**

### Method 2: From Finder
1. Navigate to: `/Users/samuelpaul/Documents/RA2411030010116/PalindromeCheckerApp`
2. Right-click on the folder
3. Select **"Open with IntelliJ IDEA"**

---

## 📝 Use Cases Implemented

### UC1: Application Entry & Welcome Message
✅ Displays welcome banner when application starts

### UC2: Hard Code Palindrome Check
✅ Tests predefined strings:
- "madam" → palindrome
- "racecar" → palindrome
- "hello" → not a palindrome
- "level" → palindrome
- "world" → not a palindrome
- "noon" → palindrome

### UC3: User Input Palindrome Check
✅ Interactive mode:
- Prompts user for input
- Checks if input is palindrome
- Allows multiple checks
- Graceful exit option

---

## 🏃 Running the Application

### From IntelliJ Terminal:
```bash
cd App/src
javac PalindromeCheckerApp.java
java PalindromeCheckerApp
```

### From IntelliJ IDE:
1. Right-click on `PalindromeCheckerApp.java`
2. Click **"Run 'PalindromeCheckerApp.main()'"**

---

## 📋 Git Workflow Reference

### Check Status
```bash
git status
git branch
```

### Create New Branch (for future use cases)
```bash
git checkout main
git pull origin main
git checkout -b UC4-YourFeatureName
```

### Commit Changes
```bash
git add App/src/PalindromeCheckerApp.java
git commit -m "UC4: Your feature description"
git push origin UC4-YourFeatureName
```

### Merge to Main (after pull request on GitHub)
```bash
git checkout main
git pull origin main
```

---

## 🎓 Features of the Code

### Palindrome Detection Logic
- **Case-insensitive**: "Madam" = "madam"
- **Space-insensitive**: "A man a plan" works correctly
- **Two-pointer algorithm**: Efficient O(n) time complexity

### Code Structure
- Clean separation of concerns
- Reusable `isPalindrome()` method
- Interactive user interface
- Proper resource management (Scanner.close())

---

## 📞 Troubleshooting

### If Java is not found:
1. Install JDK from https://www.oracle.com/java/technologies/downloads/
2. Or install OpenJDK: `brew install openjdk` (if you have Homebrew)

### If Git commands fail:
1. Configure Git identity:
```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

### If IntelliJ doesn't recognize Java:
1. Go to **File → Project Structure → Project**
2. Set Project SDK to your installed JDK
3. Set Language Level to 8 or higher

---

## ✨ Project Highlights

- ✅ Proper Git branching strategy
- ✅ Clean commit history
- ✅ Comprehensive README
- ✅ All 3 use cases implemented
- ✅ Professional code structure
- ✅ Ready for GitHub submission

---

## 📍 Your Project Location
```
/Users/samuelpaul/Documents/RA2411030010116/PalindromeCheckerApp
```

**Status:** Ready to push to GitHub! 🚀

---

*Generated on March 2, 2026*
