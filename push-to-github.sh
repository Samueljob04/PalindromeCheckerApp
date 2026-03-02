#!/bin/bash

# ============================================
# GitHub Push Script for PalindromeCheckerApp
# ============================================

echo "🚀 PalindromeCheckerApp - GitHub Push Helper"
echo "============================================"
echo ""

# Check if we're in the right directory
if [ ! -d ".git" ]; then
    echo "❌ Error: Not a git repository!"
    echo "Please run this script from: /Users/samuelpaul/Documents/RA2411030010116/PalindromeCheckerApp"
    exit 1
fi

echo "📍 Current location: $(pwd)"
echo ""

# Step 1: Ask for GitHub username
echo "Step 1: GitHub Setup"
echo "-------------------"
read -p "Enter your GitHub username: " GITHUB_USERNAME

if [ -z "$GITHUB_USERNAME" ]; then
    echo "❌ Username cannot be empty!"
    exit 1
fi

REPO_URL="https://github.com/$GITHUB_USERNAME/PalindromeCheckerApp.git"

echo ""
echo "🔗 Will use repository: $REPO_URL"
echo ""

# Step 2: Check if remote exists
if git remote | grep -q "origin"; then
    echo "⚠️  Remote 'origin' already exists. Updating URL..."
    git remote set-url origin "$REPO_URL"
else
    echo "➕ Adding remote 'origin'..."
    git remote add origin "$REPO_URL"
fi

echo "✅ Remote configured!"
echo ""

# Step 3: Show current status
echo "Step 2: Current Git Status"
echo "-------------------------"
git status
echo ""

# Step 4: Push to GitHub
echo "Step 3: Push to GitHub"
echo "---------------------"
read -p "Do you want to push all branches to GitHub now? (y/n): " CONFIRM

if [ "$CONFIRM" != "y" ] && [ "$CONFIRM" != "Y" ]; then
    echo "❌ Push cancelled."
    echo ""
    echo "💡 When you're ready, run these commands manually:"
    echo "   git push -u origin main"
    echo "   git push origin UC1-WelcomeMessage"
    echo "   git push origin UC2-HardCodePalindrome"
    echo "   git push origin UC3-UserInputPalindrome"
    exit 0
fi

echo ""
echo "📤 Pushing main branch..."
git push -u origin main

if [ $? -eq 0 ]; then
    echo "✅ Main branch pushed successfully!"
else
    echo "❌ Failed to push main branch. Please check your credentials and try again."
    exit 1
fi

echo ""
echo "📤 Pushing UC1-WelcomeMessage branch..."
git push origin UC1-WelcomeMessage

echo ""
echo "📤 Pushing UC2-HardCodePalindrome branch..."
git push origin UC2-HardCodePalindrome

echo ""
echo "📤 Pushing UC3-UserInputPalindrome branch..."
git push origin UC3-UserInputPalindrome

echo ""
echo "🎉 ============================================"
echo "🎉 All branches pushed successfully!"
echo "🎉 ============================================"
echo ""
echo "📋 Next Steps:"
echo "  1. Go to: https://github.com/$GITHUB_USERNAME/PalindromeCheckerApp"
echo "  2. Verify all your branches are there"
echo "  3. Your code is now on GitHub! 🚀"
echo ""
